import java.util.*;

public class PersonX {
    private int age;

    public PersonX(int initialAge) {
        if (initialAge > -1 ) {
            this.age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }


    public void amIOld() {
        if (age<13) {
            System.out.println("You are young.");
        } else if ( age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else
        System.out.println("You are old.");
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            PersonX p = new PersonX(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}