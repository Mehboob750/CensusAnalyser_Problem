package censusanalyser;
import java.util.Map;

public class CensusAdapterFactory {

    public Map<String, CensusDAO> loadCensusData(CensusAnalyser.Country country, String... csvFilePath) throws CensusAnalyserException {
        if(country.equals(CensusAnalyser.Country.INDIA))
            return new IndiaCensusAdapter().loadCensusData(csvFilePath);
        else if (country.equals(CensusAnalyser.Country.US))
            return new USCensusAdapter().loadCensusData(csvFilePath);
        else throw new CensusAnalyserException(CensusAnalyserException.ExceptionType.INVALID_COUNTRY,"Invalid Country");
    }
}