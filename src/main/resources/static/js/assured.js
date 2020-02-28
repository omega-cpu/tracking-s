
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(assured, status){
            $('#idEdit').val(assured.id);
            $('#policynumberEdit').val(assured.policynumber);
            $('#nameEdit').val(assured.name);
            $('#percentageEdit').val(assured.percentage);
            $('#dobEdit').val(assured.dob);
            $('#relationEdit').val(assured.relation);
            $('#requestTypeEdit').val(assured.requestType);
            $('#statusEdit').val(assured.status);
            $('#locationEdit').val(assured.location);
            $('#commentEdit').val(assured.comment);
            
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(assured, status){
            $('#idDetails').val(assured.id);
            $('#createdByDetails').val(assured.createdBy);
            $('#createdDateDetails').val(assured.createdDate.substr(0,9).replace("T", " "));
            $('#lastModifiedByDetails').val(assured.lastModifiedBy);
            $('#lastModifiedDateDetails').val(assured.lastModifiedDate.substr(0,9).replace("T", " "));
          
           
        });

        $('#detailsModal').modal();

    });


});