package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("Valute")
public class Valute {
    @XStreamAlias("NumCode")
    private String NumCode;
    @XStreamAlias("CharCode")
    private String CharCode;
    @XStreamAlias("Nominal")
    private String Nominal;
    @XStreamAlias("Name")
    private String Name;
    @XStreamAlias("Value")
    private String Value;


    public Valute() { }

    public Valute(String  numCode, String charCode, String nominal, String name, String value) {
        NumCode = numCode;
        CharCode = charCode;
        Nominal = nominal;
        Name = name;
        Value = value;
    }

    public String getNumCode() {
        return NumCode;
    }

    public void setNumCode(String numCode) {
        NumCode = numCode;
    }

    public String getCharCode() {
        return CharCode;
    }

    public void setCharCode(String charCode) {
        CharCode = charCode;
    }

    public String getNominal() {
        return Nominal;
    }

    public void setNominal(String nominal) {
        Nominal = nominal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Valute{" +
                "NumCode='" + NumCode + '\'' +
                ", CharCode='" + CharCode + '\'' +
                ", Nominal='" + Nominal + '\'' +
                ", Name='" + Name + '\'' +
                ", Value='" + Value + '\'' +
                '}';
    }

}
