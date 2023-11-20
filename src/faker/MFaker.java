package faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class MFaker {

    public static String pbool(int b) {
        String v = "True";
        if (b==2)
            v = "False";
        return v;
    }
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));


        try {
            FileWriter myWriter = new FileWriter("Insertdaten.txt");
            for (int i = 0; i <101; i++) {

                String name = faker.name().fullName();
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String email = faker.name().firstName() + "." + faker.name().lastName() + "@faker.at";
                String number = faker.phoneNumber().phoneNumber();
                String rnumber = faker.number().digit();
                String land = faker.country().capital();
                String firma = faker.company().name();
                String kostume = faker.dragonBall().character();
                String gengre = faker.music().genre();
                Double price = faker.number().randomDouble(2,100,1000);

                /*
                if(i == 100) {
                    myWriter.write("(" + i + ",'" + name + "', '" + firstName + "', '" + lastName + "','" + email + "', '" + number + "')," + "\n");
                }else{
                    myWriter.write("(" + i + ",'" + name + "', '" + firstName + "', '" + lastName + "','" + email + "', '" + number + "')," + "\n");
                }
                */

                /*
                if(i == 100){
                    myWriter.write("(" + i + ", '" + rnumber + "', '" + rnumber + "', " + pbool(faker.number().numberBetween(1,3)) + ")," + "\n");
                }else{
                    myWriter.write("(" + i + ", '" + rnumber + "', '" + rnumber + "', " + pbool(faker.number().numberBetween(1,3)) + ")," + "\n");
                }

                 */


                /*
                if(i == 100){
                    myWriter.write("(" + i + ", '" + firma + "', '" + land + "', '" + name + "')," + "\n");
                }else{
                    myWriter.write("(" + i + ", '" + firma + "', '" + land + "', '" + name + "')," + "\n");
                }

                 */

                if(i == 100){
                    myWriter.write("(" + i + ", '" + kostume + "', '" + gengre + "', '" + price + "')," + "\n");
                }else{
                    myWriter.write("(" + i + ", '" + kostume + "', '" + gengre + "', '" + price + "')," + "\n");
                }


            }
                myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
        }

    }
    }



