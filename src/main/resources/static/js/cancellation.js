
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(cancellation, status){
            $('#idEdit').val(cancellation.id);
            $('#policyNumberEdit').val(cancellation.policyNumber);
            $('#policyHolderEdit').val(cancellation.policyHolder);
            $('#idNumberEdit').val(cancellation.idNumber);
            $('#policyNumberEdit').val(cancellation.policyNumber);
            $('#telephoneEdit').val(cancellation.telephone);
            $('#postalAddressEdit').val(cancellation.postalAddress);
            $('#monthlyPremiumEdit').val(cancellation.monthlyPremium);
            $('#accountEdit').val(cancellation.account);
            $('#accountNumberEdit').val(cancellation.accountNumber);
            $('#branchEdit').val(cancellation.branch);
            $('#reasonEdit').val(cancellation.reason);
            $('#commentEdit').val(cancellation.comment);
            $('#statusEdit').val(cancellation.status);
            $('#locationEdit').val(cancellation.location);
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(cancellation, status){
            $('#idDetails').val(cancellation.id);
            $('#createdByDetails').val(cancellation.createdBy);
            $('#createdDateDetails').val(cancellation.createdDate);
            $('#lastModifiedByDetails').val(cancellation.lastModifiedBy);
            $('#lastModifiedDateDetails').val(cancellation.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});