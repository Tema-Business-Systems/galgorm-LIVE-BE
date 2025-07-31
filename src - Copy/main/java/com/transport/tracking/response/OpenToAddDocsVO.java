package com.transport.tracking.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenToAddDocsVO {

    private String site;
    private String routeStatus;
    private String docnum;
    private String adrescode;
    private String adresname;
    private String docdate;
    private String dlvystatus;
    private String doctype;

    private String bpcode;
    private String bpname;
    private String drivercode;
    private String vehicleCode;
    private String tripno;
    private String vrcode;
    private String seq;
    private List<ProductVO> products;
    private String city;
    private String weight;
    private String wunit;
    private String volume;
    private String vunit;

}


