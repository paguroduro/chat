package itismeucci.chat.lib;
import java.util.*;

/** Classe dello schema "hello". */
public class HelloSchema extends SignedSchema
{
	/** [Reflection] crea un'istanza. */
	private HelloSchema()
	{
		super("hello");
	}

	/**
	 * Crea un'istanza col relativo UUID.
	 * @param id ID dell'utente.
	 */
	public HelloSchema(UUID id) throws SchemaException
	{
		super("hello", id);
	}

	@Override
	public HelloSchema cloneSchema() throws SchemaException
	{
		return new HelloSchema(getId());
	}
}
