
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(benefit, status){
            $('#idEdit').val(benefit.id);
            $('#policynumberEdit').val(benefit.policynumber);
            $('#nameEdit').val(benefit.name);
            $('#percentageEdit').val(benefit.percentage);
            $('#sumAssuredEdit').val(benefit.sumAssured);
            $('#requestTypeEdit').val(benefit.requestType);
            $('#statusEdit').val(benefit.status);
            $('#locationEdit').val(benefit.location);
            $('#commentEdit').val(benefit.comment);
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(benefit, status){
            $('#idDetails').val(benefit.id);
            $('#createdByDetails').val(benefit.createdBy);
            $('#createdDateDetails').val(benefit.createdDate);
            $('#lastModifiedByDetails').val(benefit.lastModifiedBy);
            $('#lastModifiedDateDetails').val(benefit.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});