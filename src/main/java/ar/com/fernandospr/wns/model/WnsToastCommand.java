package ar.com.fernandospr.wns.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * From <a href="https://msdn.microsoft.com/en-us/library/windows/apps/dn268317.aspx">https://msdn.microsoft.com/en-us/library/windows/apps/dn268317.aspx</a>
 */
@XmlRootElement(name = "command")
public class WnsToastCommand {
    @XmlAttribute
    public String id;
    @XmlAttribute
    public String arguments;

    public WnsToastCommand(String id, String arguments) {
        this.id = id;
        this.arguments = arguments;
    }
}
