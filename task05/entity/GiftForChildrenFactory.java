package by.epam.task05.entity;

public class GiftForChildrenFactory implements GiftFactory{

    @Override
    public ActionWithGift createGift(){
        return new GiftForChildren();
    }
}
