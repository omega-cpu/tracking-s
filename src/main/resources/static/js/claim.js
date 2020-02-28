
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(claim, status){
            $('#idEdit').val(claim.id);
            $('#policyNumberEdit').val(claim.policyNumber);
            $('#policyHolderEdit').val(claim.policyHolder);
            $('#telephoneEdit').val(claim.telephone);
            $('#postalAddressEdit').val(claim.postalAddress);
            $('#emailAdressEdit').val(claim.emailAdress);

            $('#commencementDateEdit').val(claim.commencementDate);
            $('#firstPremiumMonthEdit').val(claim.firstPremiumMonth);
            $('#contributedEdit').val(claim.contributed);
            
            $('#accountNameEdit').val(claim.accountName);
            $('#firstPremiumMonthEdit').val(claim.firstPremiumMonth);
            $('#accountNOEdit').val(claim.accountNO);
            $('#monthlyPremiumEdit').val(claim.monthlyPremium);
            $('#requirementEdit').val(claim.requirement);
            $('#reasonEdit').val(claim.reason);
            $('#otherReasonEdit').val(claim.otherReason);
            $('#dateOfDeathEdit').val(claim.dateOfDeath);
            $('#beneficiaryEdit').val(claim.beneficiary);
            $('#taccountHolderNameEdit').val(claim.taccountHolderName);
            $('#taccountNameEdit').val(claim.taccountName);
            $('#taccountNumberEdit').val(claim.taccountNumber);
            $('#tbranchEdit').val(claim.tbranch);
            $('#dateEdit').val(claim.date);
            $('#locationEdit').val(claim.location);
            $('#statusEdit').val(claim.status);
            $('#commentEdit').val(claim.comment);
            
            
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(claim, status){
            $('#idDetails').val(claim.id);
            $('#createdByDetails').val(claim.createdBy);
            $('#createdDateDetails').val(claim.createdDate);
            $('#lastModifiedByDetails').val(claim.lastModifiedBy);
            $('#lastModifiedDateDetails').val(claim.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});