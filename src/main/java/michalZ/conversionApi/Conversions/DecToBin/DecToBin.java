package michalZ.conversionApi.Conversions.DecToBin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.InsufficientResourcesException;

@RestController
@RequestMapping(path = "dec-to-bin")
public class DecToBin {

    @GetMapping("/{dec}")
    public String decToBin(@PathVariable Long dec){
        return Long.toBinaryString(dec);
    }
}
