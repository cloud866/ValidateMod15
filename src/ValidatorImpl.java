public class ValidatorImpl implements Validator {

    @Override
    public boolean validate(int value) {
        return value >= 60;
    }
}
