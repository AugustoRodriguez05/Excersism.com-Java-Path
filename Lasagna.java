public class Lasagna {
        public int expectedMinutesInOven(){
            return 40;
        }

        public int remainingMinutesInOven(int time){
            return 40 - time;
        }

        public int preparationTimeInMinutes(int layer){
            return layer * 2;
        }

        public int totalTimeInMinutes(int layers, int minutes){
            return (layers * 2) + minutes;
        }

       public static void main(String[] args) {
            Lasagna lasagna = new Lasagna();
            System.out.println(lasagna.expectedMinutesInOven());
            System.out.println(lasagna.remainingMinutesInOven(30));
            System.out.println(lasagna.preparationTimeInMinutes(2));
            System.out.println(lasagna.totalTimeInMinutes(3, 20));
   }
}

