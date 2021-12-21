import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpecsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> specsNames=Stream.of("Ray-Ban","Oakley","Carrera","Fastrack","Polaroid","Farenheit","Armani Exchange","IDEE",
				"Vouge"," Burberry"," Police","Flying Machine","Prada"," Gucci"," Calvin Klein"," Lacoste",
				"Esprit","Scott"," Versace","Fossil");
		
		List<String> tempSpecsstream=specsNames.sorted().map(String::toLowerCase).collect(Collectors.toList());
		
		tempSpecsstream.forEach((e)->System.out.println(e));
		
		
		System.out.println("=======UPPER CASEEE========");

		Stream<String> specsNames1=Stream.of("Ray-Ban","Oakley","Carrera","Fastrack","Polaroid","Farenheit","Armani Exchange","IDEE",
				"Vouge"," Burberry"," Police","Flying Machine","Prada"," Gucci"," Calvin Klein"," Lacoste",
				"Esprit","Scott"," Versace","Fossil");
		
		List<String> tempSpecsstream1=specsNames1.sorted().map(String::toUpperCase).collect(Collectors.toList());
		
		tempSpecsstream1.forEach((f)->System.out.println(f));
		
		

	}

}
