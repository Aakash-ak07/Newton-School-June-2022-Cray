// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. You need to perform the below operations:

static class Student {
	String name;
	int rollNumber;
}

public static Student myFunction (String name, int rollNumber){
	// your function code goes here
	Student obj = new Student();
	obj.name = name;
	obj.rollNumber = rollNumber;

	return obj;
}


// Input:
// Gaurav 1

// Output:
// Gaurav 1
