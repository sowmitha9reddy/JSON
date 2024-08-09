

	import org.json.simple.JSONObject;
	import org.json.simple.JSONObject;
	import org.json.simple.JSONValue;

	// Program for print data in JSON format.
	public class MainCode {
		public static void main(String args[])
		{
			// In java JSONObject is used to create JSON object
			// which is a subclass of java.util.HashMap.

			JSONObject file = new JSONObject();

			file.put("Full Name", "Ritu Sharma");
			file.put("Roll No.", new Integer(1704310046));
			file.put("Tuition Fees", new Double(65400));

			// To print in JSON format.
			System.out.print(file);
			System.out.println();

		
				String k = "{\"Full Name\":\"Ritu Sharma\", \"Tuition Fees\":65400.0, \"Roll No.\":1704310046}";
				Object file2 = JSONValue.parse(k);

				// In java JSONObject is used to create JSON object
				JSONObject jsonObjectdecode = (JSONObject)file2;

				// Converting into Java Data type
				// format From Json is the step of Decoding.
				String name
					= (String)jsonObjectdecode.get("Full Name");
				double fees
					= (Double)jsonObjectdecode.get("Tuition Fees");
				long rollno
					= (Long)jsonObjectdecode.get("Roll No.");
				System.out.println(name + " " + fees + " "
								+ rollno);
			
		}

	}


