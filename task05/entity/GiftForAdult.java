package by.epam.task05.entity;

public class GiftForAdult extends Gift implements ActionWithGift{
    public GiftForAdult(){
    }

    public GiftForAdult(String pack, String[] sweets, int[] price){
        super(pack, sweets, price);
    }

    @Override
    public void calculatePrice(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The cost of the sweets = " + sum +" BYN");

    }

    @Override
    public void getList(String[] arr){
        System.out.println("The list of sweets");
        for(int i = 0; i < arr.length; i++){
            System.out.println("-" + arr[i]);
        }
    }
     @Override
    public String addDrink(){
        return "For adult need add 1 bottle of vine";
    }
}
