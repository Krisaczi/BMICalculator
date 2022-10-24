public class User {

        public double wzrost;
        public double waga;
        public int ID;

        public User(double wzrost, double waga, int ID) {
            this.wzrost = wzrost;
            this.waga = waga;
            this.ID = ID;
        }

        public double getWzrost() {
            return wzrost;
        }

        public void setWzrost(double wzrost) {
            this.wzrost = wzrost;
        }

        public double getWaga() {
            return waga;
        }

        public void setWaga(double waga) {
            this.waga = waga;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }


