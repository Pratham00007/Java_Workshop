import java.io.Serializable;
class customer implements Serializable{
    String userid="NIET";
    transient String pwd="College"; // to not allow to change
}