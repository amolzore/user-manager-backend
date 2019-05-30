package com.amolzore.cloud.usermanager.controller.v1;

        import com.amolzore.cloud.usermanager.controller.filter.UserFilterBody;
        import com.amolzore.cloud.usermanager.service.UserService;
        import lombok.RequiredArgsConstructor;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.client.HttpClientErrorException;

        import static com.amolzore.cloud.usermanager.controller.ApiPath.*;
        import static org.springframework.http.HttpStatus.OK;
        import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
        import static org.springframework.web.bind.annotation.RequestMethod.GET;
        import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@Slf4j
@RestController("userControllerV1")
@RequestMapping(API_V1_PATH + SERVICE_PATH)
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = POST, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getUser(@RequestBody UserFilterBody userFilterBody) throws HttpClientErrorException {
        return new ResponseEntity(userService.findByFilter(userFilterBody), OK);
    }

    @RequestMapping(value = ID_PATH, method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getUserById(@PathVariable("id") int id) throws HttpClientErrorException {
        return new ResponseEntity(userService.findById(id), OK);
    }
}