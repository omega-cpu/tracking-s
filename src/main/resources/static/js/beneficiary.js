
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(beneficiary, status){
            $('#idEdit').val(beneficiary.id);
            $('#policynumberEdit').val(beneficiary.policynumber);
            $('#nameEdit').val(beneficiary.name);
            $('#percentageEdit').val(beneficiary.percentage);
            $('#dobEdit').val(beneficiary.dob);
            $('#relationEdit').val(beneficiary.relation);
            $('#requestTypeEdit').val(beneficiary.requestType);
            $('#statusEdit').val(beneficiary.status);
            $('#locationEdit').val(beneficiary.location);
            $('#commentEdit').val(beneficiary.comment);
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(beneficiary, status){
            $('#idDetails').val(beneficiary.id);
            $('#createdByDetails').val(beneficiary.createdBy);
            $('#createdDateDetails').val(beneficiary.createdDate);
            $('#lastModifiedByDetails').val(beneficiary.lastModifiedBy);
            $('#lastModifiedDateDetails').val(beneficiary.lastModifiedDate);
            
          
           
        });

        $('#detailsModal').modal();

    });


});