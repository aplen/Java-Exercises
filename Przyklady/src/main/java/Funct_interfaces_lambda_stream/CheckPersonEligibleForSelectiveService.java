package Funct_interfaces_lambda_stream;

class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean check(Person p) {
        return p.gender == Person.Sex.MALE && p.getAge() >= 20 && p.getAge() <= 40;
    }

}