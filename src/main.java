
import com.sap.aii.mapping.api.DynamicConfiguration;
import com.sap.aii.mapping.api.DynamicConfigurationKey;
import com.sap.aii.mapping.api.StreamTransformationConstants;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.utilxi.web.cachemonitoring.util.container.Container;

/**
 * Change File name (fname) in a Message Mapping
 * Title: changeFileName
 * Descriptions: Change File name (fname) in a Message Mapping
 * Execution Type: Single Values
 * Category: Adapter_Functions
 * 
 * @author rassakhatsky
 */
public class main {

    public String fName_change(String value, String sth, Container container) throws StreamTransformationException {
        /*
         * This function can change "fname" parametr for File Adapter. Put new value into the 1st argument and some another into the 2nd.
         * The function changed "fname".
         */

        DynamicConfiguration conf = (DynamicConfiguration) container.getTransformationParameters().get(StreamTransformationConstants.DYNAMIC_CONFIGURATION);
        DynamicConfigurationKey key = DynamicConfigurationKey.create("http://sap.com/xi/XI/System/File", "FileName");
        String fname = value;
        conf.put(key, fname);
        return sth;
    }
}
