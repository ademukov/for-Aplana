/**
 * Created by Владимир on 26.03.2017.
 */
public class Employee {

        private String firstName;
        private String lastName;
        private String position;
        private int solary;

        public Employee(String firstName, String lastName, String position, int solary) {
            setLastName(lastName);
            setFirstName(firstName);
            setPosition(position);
            setSolary(solary);
        }

        public Employee(){}

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = getStringWithUpperCase(firstName);
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = getStringWithUpperCase(lastName);
        }

        private String getStringWithUpperCase(String s) {
            String firstSymbol = s.substring(0,1);
            return firstSymbol.toUpperCase() + s.substring(1, s.length());
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = getStringWithUpperCase(position);
        }

        public int getSolary() {
            return solary;
        }

        public String getSolaryWithCurrency() {
            return String.valueOf(solary) + " руб.";
        }

        public void setSolary(int solary) {
            this.solary = solary;
        }


        /**
         * переопреденный метод toString для получения информации о сотруднике
         * @return - информация о сотруднике
         */
        @Override
        public String toString() {
            return "Сотрудник{" +
                    "Имя='" + firstName + '\'' +
                    ", Фамилия='" + lastName + '\'' +
                    ", Должность='" + position + '\'' +
                    ", Зарплата=" + getSolaryWithCurrency() +
                    '}';
        }
    }

