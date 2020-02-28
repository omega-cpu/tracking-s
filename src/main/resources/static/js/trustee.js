
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(trustee, status){
            $('#idEdit').val(trustee.id);
            $('#policynumberEdit').val(trustee.policynumber);
            $('#nameEdit').val(trustee.name);
            $('#percentageEdit').val(trustee.percentage);
            $('#dobEdit').val(trustee.dob);
            $('#relationEdit').val(trustee.relation);
            $('#requestTypeEdit').val(trustee.requestType);
            $('#statusEdit').val(trustee.status);
            $('#locationEdit').val(trustee.location);
            
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(trustee, status){
            $('#idDetails').val(trustee.id);
            $('#createdByDetails').val(trustee.createdBy);
            $('#createdDateDetails').val(trustee.createdDate);
            $('#lastModifiedByDetails').val(trustee.lastModifiedBy);
            $('#lastModifiedDateDetails').val(trustee.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});