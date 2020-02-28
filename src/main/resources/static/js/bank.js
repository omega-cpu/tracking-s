
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(bank, status){
            $('#idEdit').val(bank.id);
            $('#policynumberEdit').val(bank.policynumber);
            $('#bankNameEdit').val(bank.bankName);
            $('#accountNameEdit').val(bank.accountName);
            $('#acountNumberEdit').val(bank.acountNumber);
            $('#accountTypeEdit').val(bank.accountType);
            $('#branchEdit').val(bank.branch);
            $('#statusEdit').val(bank.status);
            $('#locationEdit').val(bank.location);
            $('#commentEdit').val(bank.comment);
            
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(bank, status){
            $('#idDetails').val(bank.id);
            $('#createdByDetails').val(bank.createdBy);
            $('#createdDateDetails').val(bank.createdDate);
            $('#lastModifiedByDetails').val(bank.lastModifiedBy);
            $('#lastModifiedDateDetails').val(bank.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});