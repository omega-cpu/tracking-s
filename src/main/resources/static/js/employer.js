
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(employer, status){
            $('#idEdit').val(employer.id);
            $('#policynumberEdit').val(employer.policynumber);
            $('#nameEdit').val(employer.name);
            $('#idStaffEdit').val(employer.idStaff);
            $('#locationEdit').val(employer.location);
            $('#statusEdit').val(employer.status);
            $('#commentEdit').val(employer.comment);
           
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(employer, status){
            $('#idDetails').val(employer.id);
            $('#createdByDetails').val(employer.createdBy);
            $('#createdDateDetails').val(employer.createdDate);
            $('#lastModifiedByDetails').val(employer.lastModifiedBy);
            $('#lastModifiedDateDetails').val(employer.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});