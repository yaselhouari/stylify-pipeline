package com.example.ec.apis;

import com.example.ec.domain.MyServicePackage;
import com.example.ec.service.MyServicePackageService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;

@RestController
@RequestMapping("service_packages")
public class MyServicePackageController {
    @Autowired
    MyServicePackageService myServicePackageService;

    @GetMapping
    public Iterable<MyServicePackage> getServicePackages() {
        return myServicePackageService.lookup();
    }

    @GetMapping("/service_packages/gender/{gender}")
    public Iterable<MyServicePackage> getServicesByByGender(@PathVariable  String gender) throws UnknownHostException {
        return myServicePackageService.getServicePackageByGender(gender);
    }

    @RequestMapping(value = "/icons/{packageId}.png", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] getImageAsByteArrayById(@PathVariable Integer packageId) throws IOException {
        String url = "/static/icons/" + packageId + ".png";
        System.out.println(url);
        InputStream in = getClass().getResourceAsStream("/static/icons/" + packageId + ".png");
        return IOUtils.toByteArray(in);
    }

}
