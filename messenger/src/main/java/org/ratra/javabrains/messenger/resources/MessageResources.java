package org.ratra.javabrains.messenger.resources;

import java.util.List;










import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rahul.messenger.model.Employee;
import org.rahul.messenger.model.Message;
import org.rahul.messenger.model.MessageService;


@Path("/message")
public class MessageResources {

	MessageService service = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return service.getAllMessage();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return  service.addMessage(message); 
	}
	
	@PUT
	@Path("/{mesageID}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("mesageID") long id,Message message)
	{	message.setId(id);
		return service.updateMessage(message);
	}
	
	@DELETE
	@Path("/{mesageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("mesageID") long id)
	{
		service.removeMessage(id);
	}
	@GET
	@Path("/{mesageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message test(@PathParam("mesageID") long messageID)
	{
		return service.getMessage(messageID);
	}
}
