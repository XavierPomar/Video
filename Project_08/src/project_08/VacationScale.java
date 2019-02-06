package project_08;

public class VacationScale {

    int [] vacationDays;
    int yearsOfService;
    
    public void setVacationScale (){
    vacationDays = new int[11];
    vacationDays[0] = 10;
    vacationDays[1] = 15;
    vacationDays[2] = 15;
    vacationDays[3] = 15;
    vacationDays[4] = 20;
    vacationDays[5] = 20;
    vacationDays[6] = 25;
    vacationDays[7] = 25;
    vacationDays[8] = 30;
    vacationDays[9] = 30;
    vacationDays[10] = 35;
    }
    
     public void displayVacationDays (){
     if (yearsOfService < 0) {
     System.out.println("Numero de anys invalid");
     } else if (yearsOfService <= 6){
         System.out.println("Dies de vacacions: " + vacationDays[yearsOfService]);
     } else {
         System.out.println("Dies de vacacions: " + vacationDays[8]);
     }
   }   
}
