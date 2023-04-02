package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp2 {

        public static void main(String[] args) {
            ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");
            Scanner sc = new Scanner(System.in);
            System.out.println("Select machine type");
            System.out.println("1:PetrolCar\n2:PetrolEngine\n3:DieselCar\n4:DieselEngine");
            int choice = sc.nextInt();
            Car c2 = null;
            Engine e1 = null;
            if(choice ==1 ){
                c2 = c1.getBean("car1", Car.class);
            } else if (choice == 2) {
                e1 = c1.getBean("engine1", Engine.class);
            } else if (choice == 3) {
                c2 = c1.getBean("car2", Car.class);
            } else if (choice == 4) {
                e1 = c1.getBean("engine2", Engine.class);

            }
            if (c2!=null) {
                c2.getType();
                c2.getEngineInfo();
            } else if (e1!=null) {
                e1.getType();
                e1.getEngineInfo();
            }

            }
        }

