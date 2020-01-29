package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSocket {

    public static void main(String[] args) {
        try{
            Socket cliente = new Socket("172.16.4.198", 12346);
            
            //Çendo mensagens do servidor
            new Thread(){
                @Override
                public void run() {
                    try {
                        BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                        
                        while(true){
                            String mensagem = leitor.readLine();
                            System.out.println(mensagem);
                        }
                    } catch (IOException e) {
                        System.out.println("**Impossivel ler a mensagem do servidor");
                        e.printStackTrace();
                    }
                }
                
            }.start();
            
            //Escrevendo mensagens para o Servidor
            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader leitorTerminal = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String mensagemTerminal = leitorTerminal.readLine();
                if(mensagemTerminal == null) continue;
                escritor.println(mensagemTerminal);
                if(mensagemTerminal.equalsIgnoreCase("::SAIR")){
                    if(mensagemTerminal == null) continue;
                    System.exit(0);
                }
            }
            
        } catch(UnknownHostException e){
            System.out.println("O endereço passado é inválido!");
        } catch(IOException e) {
            System.out.println("O Servidor pode estar fora do ar");
        }
    }

}
