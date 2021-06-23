package SOLIDPatientDemo;

public interface IPatient extends IGenerateBill, ISetDiseaseName, IExtraCharges{
    //open-closed principle implementation
    public String getDescription();
}
