package at.fhtw.swen2.patterns.templatemethod;

public class PermanentEmployee extends Employee {
    @Override
    protected String getProjectDetailsImpl() {
        return "permanent";
    }
}
