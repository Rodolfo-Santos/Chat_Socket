package Socket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorSocket {

    public static void main(String[] args) {
        ServerSocket servidor = null;
        try {
            System.out.println("O Servidor esta sendo Iniciado...");
            servidor = new ServerSocket(9999);
            System.out.println("\n** Servidor Iniciado com Sucesso! **");

            while (true) {
                Socket cliente = servidor.accept();
                new GerenciadorDeClientes(cliente);

/*                try {

                    ObjectInputStream out = new ObjectInputStream(cliente.getInputStream());
                    FileOutputStream arquivo = new FileOutputStream("");
                    byte[] buf = new byte[4096];

                    while (true) {
                        int len = out.read(buf);
                        if (len == -1) {
                            break;
                        }
                        arquivo.write(buf, 0, len);

                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ClienteJframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ClienteJframe.class.getName()).log(Level.SEVERE, null, ex);
                }
 */

            }

        } catch (IOException e) {
            try {
                if (servidor != null) {
                    servidor.close();
                }
            } catch (IOException e1) {
            }

            System.err.println("a porta está ocupada ou servidor foi fechado");
            e.printStackTrace();
        }

    }

}
