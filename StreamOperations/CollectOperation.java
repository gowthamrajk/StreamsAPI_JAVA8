package StreamOperations;

import java.util.ArrayList;
import StudentClass.Student;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectOperation 
{
	public static void main(String[] args) 
	{
		Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
		List<String> list = new ArrayList<>();
		stream.forEach(e->list.add(e.getName()));
		
		List<String> namesInUppercase = list.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(namesInUppercase);
	}
}