<#import "truancy/truancypage.ftl" as p>
<@p.pages>

<h2>Truancy</h2>

<nav aria-label="...">
    <ul class="pagination">
        <li class="page-item disabled">
            <a class="page-link">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item active" aria-current="page">
            <a class="page-link" href="#">2</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Date</th>
            <th scope="col">Reason</th>
            <th scope="col">Student</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>12.09.2022</td>
            <td>Cold</td>
            <td>Povietkin Andrii Vitaliyovich</td>
        </tr>
        </tbody>
    </table>
</@p.pages>