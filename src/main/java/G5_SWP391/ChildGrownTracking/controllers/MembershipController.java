package G5_SWP391.ChildGrownTracking.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import G5_SWP391.ChildGrownTracking.responses.MembershipResponse;
import G5_SWP391.ChildGrownTracking.responses.ResponseObject;
import G5_SWP391.ChildGrownTracking.services.MembershipService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/membership")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class MembershipController {
    private final MembershipService membershipService;

    @GetMapping("/{userId}")
    public ResponseEntity<ResponseObject> getMembership(@PathVariable Long userId) {
        MembershipResponse membershipResponse = membershipService.getMembershipByUserId(userId);
        if (membershipResponse != null)
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "", membershipResponse));
        else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("notFound", "", membershipResponse));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<ResponseObject> updateMembership(
            @PathVariable Long userId,
            @RequestBody Long planId
    ) {
        MembershipResponse membershipResponse = membershipService.updateMembership(userId, planId);
        if (membershipResponse != null)
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "Membership modify successfully", membershipResponse));
        else
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("fail", "No membership plan founded", membershipResponse));
    }

}
