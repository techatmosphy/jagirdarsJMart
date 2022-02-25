/**
 *
 */

$(document).ready(function() {
    console.log('working');
    $('.table .editButton').on('click', function(event) {
        event.preventDefault();

        var href = $(this).attr('href');
        $.get(href, function(user, status) {
            $('.myForm #id').val(user.id)
            $('.myForm #firstName').val(user.firstName)
            $('.myForm #lastName').val(user.lastName)
            $('.myForm #email').val(user.email)
            $('.myForm #aadharNumber').val(user.aadharNumber)
            $('.myForm #mobileNumber').val(user.mobileNumber)
            $('.myForm #panNumber').val(user.panNumber)
            $('.myForm #password').val(user.password)

        })
        $('.myForm #editModal').modal('show');
    });

});