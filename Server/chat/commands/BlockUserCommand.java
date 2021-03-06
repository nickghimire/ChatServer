/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat.commands;

import chat.client.ClientHandler;
import chat.data.object.DataObject;
import chat.server.handler.Responder;
import java.net.Socket;

/**
 *
 * @author Dixanta Bahadur Shrestha
 */
public class BlockUserCommand extends ChatCommand {
    public void executeCommand(Responder responder,DataObject dataObject,Socket client)
    {
        ClientHandler clientHandler = ClientHandler.getInstance();
        responder.writeObject(clientHandler.getClient(dataObject.getMessage()), dataObject);
    }
}
