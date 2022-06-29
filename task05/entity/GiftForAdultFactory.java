package by.epam.task05.entity;

public class GiftForAdultFactory implements GiftFactory{

    @Override
    public ActionWithGift createGift(){
        return new GiftForAdult();
    }
}
