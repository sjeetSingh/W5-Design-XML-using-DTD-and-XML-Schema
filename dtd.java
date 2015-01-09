import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.XMLReader;


final class ValidateDTD 
{
    public static void main ( String args[] ) throws Exception 
    {
    	try
    	{
    		SAXParserFactory factory = SAXParserFactory.newInstance();
        	factory.setValidating(true);
        	factory.setNamespaceAware(true);
        	XMLReader xmlReader = factory.newSAXParser().getXMLReader();
        	xmlReader.parse(args[0]);
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
