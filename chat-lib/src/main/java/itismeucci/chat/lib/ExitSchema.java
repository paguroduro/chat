package itismeucci.chat.lib;
import java.util.*;

/** Classe dello schema "exit". */
public class ExitSchema extends SignedSchema
{
	/** [Reflection] crea un'istanza. */
	private ExitSchema()
	{
		super("exit");
	}

	/**
	 * Crea un'istanza col relativo UUID.
	 * @param id ID dell'utente.
	 */
	public ExitSchema(UUID id) throws SchemaException
	{
		super("exit", id);
	}

	@Override
	public ExitSchema cloneSchema() throws SchemaException
	{
		return new ExitSchema(getId());
	}
}
