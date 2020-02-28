
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(refund, status){
            $('#idEdit').val(refund.id);
            $('#policyNumberEdit').val(refund.policyNumber);
            $('#policyHolderEdit').val(refund.policyHolder);
            $('#telephoneEdit').val(refund.telephone);
            $('#postalAddressEdit').val(refund.postalAddress);
            $('#emailAdressEdit').val(refund.emailAdress);

            $('#accountNameEdit').val(refund.accountName);
            $('#accountNOEdit').val(refund.accountNO);

            $('#monthlyPremiumEdit').val(refund.monthlyPremium);
            $('#refundDurationEdit').val(refund.refundDuration);
            $('#durationToEdit').val(refund.durationTo);

            $('#reasonEdit').val(refund.reason);
            $('#otherReasonEdit').val(refund.otherReason);
            $('#taccountHolderNameEdit').val(refund.taccountHolderName);
            $('#taccountNameEdit').val(refund.taccountName);
            $('#taccountNumberEdit').val(refund.taccountNumber);
            $('#tbranchEdit').val(refund.tbranch);
            $('#dateEdit').val(refund.date);

            $('#locationEdit').val(refund.location);
            $('#locationEdit').val(refund.location);
            $('#statusEdit').val(refund.status);
            $('#commentEdit').val(refund.comment);

        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(refund, status){
            $('#idDetails').val(refund.id);
            $('#createdByDetails').val(refund.createdBy);
            $('#createdDateDetails').val(refund.createdDate);
            $('#lastModifiedByDetails').val(refund.lastModifiedBy);
            $('#lastModifiedDateDetails').val(refund.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});