package com.example.ec.apis;

import com.example.ec.entities.MyDisplayServicePackage;
import com.example.ec.service.MyDisplayServicePackageService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;

@RestController
@RequestMapping("service_packages")
public class MyDisplayServicePackageController {
    @Autowired
    MyDisplayServicePackageService myDisplayServicePackageService;

    @GetMapping
    public Iterable<MyDisplayServicePackage> getServicePackages() {
        return myDisplayServicePackageService.lookup();
    }

    @GetMapping("/gender/{gender}")
    public Iterable<MyDisplayServicePackage> getServicesByByGender(@PathVariable  String gender) throws UnknownHostException {
        return myDisplayServicePackageService.getServicePackageByGender(gender);
    }

    @RequestMapping(value = "/icons/{packageId}.png", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] getImageAsByteArrayById(@PathVariable Integer packageId) throws IOException {
        String url = "/static/icons/" + packageId + ".png";
        ClassLoader cl = this.getClass().getClassLoader();
        System.out.println("The url is: " + url);
        InputStream in = getClass().getResourceAsStream(url);
        return IOUtils.toByteArray(in);
    }

}
