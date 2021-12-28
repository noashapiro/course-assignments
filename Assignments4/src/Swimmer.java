    public class Swimmer extends Athlete implements Swim {
        @Override
        public void swim() {
            System.out.println("I swim");
        }

        @Override
        void speciality() {
            System.out.println("My Speciality is swimming");
        }
    }


