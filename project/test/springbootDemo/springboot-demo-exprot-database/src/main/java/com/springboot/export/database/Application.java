package com.springboot.export.database;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.froad.g2p.accounting.logic.service.AccountingBatchTransferService;
import com.froad.g2p.accounting.logic.service.AccountingNormalTransferService;
import com.froad.g2p.accounting.logic.vo.internal.BulkBISPPaymentCreditInfo;
import com.froad.g2p.accounting.logic.vo.internal.DeCreditingDebitAccountInfo;
import com.froad.g2p.accounting.logic.vo.request.AccountingBulkBISPPaymentRequest;
import com.froad.g2p.accounting.logic.vo.request.AccountingDeCreditingRequest;
import com.froad.g2p.accounting.logic.vo.request.AccountingNormalTransferRequest;
import com.froad.g2p.accounting.logic.vo.response.AccountingBulkBISPPaymentResponse;
import com.froad.g2p.accounting.logic.vo.response.AccountingDeCreditingResponse;
import com.froad.g2p.accounting.logic.vo.response.AccountingNormalTransferResponse;
import com.froad.g2p.common.constant.AccountingEntryCode;
import com.froad.g2p.common.constant.BussinessErrorCode;
import com.froad.g2p.common.constant.BussinessKeyConstant;
import com.froad.g2p.common.exception.BussinessException;
import com.froad.g2p.common.service.AccountManager;
import com.froad.g2p.common.service.AccountingDetailManager;
import com.froad.g2p.common.service.FChannelInfoManager;
import com.froad.g2p.common.service.SequenceManager;
import com.froad.g2p.common.utils.DateUtils;
import com.froad.g2p.mybatis.entity.FChannelInfo;
import com.froad.g2p.mybatis.entity.FGlAccount;
import com.froad.g2p.mybatis.entity.FTransactionCode;
import com.froad.g2p.mybatis.service.FAccountingSubjectService;
import com.froad.g2p.mybatis.service.FGlAccountService;
import com.froad.g2p.mybatis.service.FTransactionCodeService;
import com.froad.g2p.mybatis.service.FTransactionDetailService;

/**
 * Created by ivan on 17/2/3.
 */
@RestController
@SpringBootApplication
@ComponentScan(value = "com.springboot.*")
@EnableAutoConfiguration
@ServletComponentScan
@EnableTransactionManagement
public class Application {

    @GetMapping("/")
    @ResponseBody
    public String defaultPage(HttpSession session) {
        session.setAttribute("uid", UUID.randomUUID());

        return session.getAttribute("uid").toString();
    }

    public static void main(String[] args) {
        // SpringApplication.run("classpath: /application-context.xml", args);
        SpringApplication.run(Application.class, args);
    }
}
