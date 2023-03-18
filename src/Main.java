//ALL/
public class Main {
    public static void main(String[] args) {
       int value = 70;
       //validate(value, new ValidatorImpl());
       validate(value, new Validator() {
           @Override
           public boolean validate(int value) {
               return value >= 80;
           }
       });

    }


    private static void validate(int value, Validator validator) {
        System.out.println("Проверяем переданое значение согласно валидатору.....");
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("Отлично! Значение верно!");
        } else {
            System.out.println("Упс! Значение не верно");
        }
    }
}