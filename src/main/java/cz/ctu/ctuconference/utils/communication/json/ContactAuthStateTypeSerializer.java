package cz.ctu.ctuconference.utils.communication.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import cz.ctu.ctuconference.contact.domain.ContactAuthState;

import java.lang.reflect.Type;

/**
 * Created by Nick nemame on 20.11.2016.
 */
public class ContactAuthStateTypeSerializer implements
		JsonSerializer<ContactAuthState> {

	@Override
	public JsonElement serialize(ContactAuthState contactAuthState, Type type, JsonSerializationContext jsonSerializationContext) {
		Gson gson = new Gson();
		return gson.toJsonTree(contactAuthState.getValue());
	}

}
