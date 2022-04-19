package at.fhtw.swen2.patterns.templatemethod;

public class ContractEmployee extends Employee {
    @Override
    protected String getProjectDetailsImpl() {
        return "contract";
    }


}
