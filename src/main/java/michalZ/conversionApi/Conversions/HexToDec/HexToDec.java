package michalZ.conversionApi.Conversions.HexToDec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HexToDec {

    @PostMapping("/hex-to-dec")
    public DecClass hexToDec(@RequestBody HexClass hex) {
        return new DecClass(hex.getHex());
    }
}
