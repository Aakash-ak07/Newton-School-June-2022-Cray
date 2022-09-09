// In this question, you need to create a class Student which has 4 parameters:-
// name ( String )
// eng (int)
// maths (int)
// hindi (int)

// Also, you need to complete the given three functions:-
// createStudentArray:- In which you need to create an array of students and take input
// engAverage:- In which you need to create an average of marks in English.
// avgPercentageOfClass:- In which you need to calculate the average percentage of the class.

// Note:- Scanner is already defined in this question. Use "sc" for scanner.

static class Student
{
    String name;
    int eng;
    int maths;
    int hindi;
}
static Student[] createStudentArray(int n)
    {
       Student[] st = new Student[n];
       for(int i = 0; i < n; i++)
       {
           Student stdt = new Student();
           stdt.name = sc.next();
           stdt.eng = sc.nextInt();
           stdt.maths = sc.nextInt();
           stdt.hindi = sc.nextInt();
           st[i] = stdt;
        } 
        return st;
    }
    
    static int engAverage(Student st[], int n)
    {
        int total = 0;
        for(int i=0;i<n;i++)
        {
            total += st[i].eng;
        }
        return total / n;
    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
        int total = 0;
        for(int i=0;i<n;i++)
        {
            int allSubject = 0;
            allSubject += st[i].eng + st[i].maths + st[i].hindi;
            allSubject /= 3;
            total += allSubject; 
        }
        return (total/n);
    }

// Sample Input:-
// 3
// Shiv 65 47 78
// Negi 55 40 56
// Gargi 43 56 40

// Sample Output:-
// 54
// 53

// Explanation:-
// Average marks in eng = (65 + 55 + 43)/3 = 163/3 = 54
// Average percentage of class =>
// shiv = (65 + 47 + 78)/3 = 190/3 = 63
// Negi = (55 + 40 + 56)/3 = 151/3 = 50
// Gargi = (43 + 56 + 40)/3 = 139/3 = 46
// avg = (63 + 50 + 46 )/3 = 159 = 53
