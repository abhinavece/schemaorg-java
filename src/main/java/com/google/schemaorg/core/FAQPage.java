package com.google.schemaorg.core;

import javax.annotation.Nullable;

import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;

public interface FAQPage extends WebPage {

	public interface Builder extends WebPage.Builder {
		
	    @Override
	    Builder addJsonLdContext(@Nullable JsonLdContext context);

	    @Override
	    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

	    @Override
	    Builder setJsonLdId(@Nullable String value);

	    @Override
	    Builder setJsonLdReverse(String property, Thing obj);

	    @Override
	    Builder setJsonLdReverse(String property, Thing.Builder builder);
	    
	    /** Add a value to property mainEntity. */
	    Builder addMainEntity(Thing value);

	    /** Add a value to property mainEntity. */
	    Builder addMainEntity(Thing.Builder value);

	    /** Add a value to property mainEntity. */
	    Builder addMainEntity(String value);
	    
	    /**
	     * Add a value to property.
	     *
	     * @param name The property name.
	     * @param value The value of the property.
	     */
	    Builder addProperty(String name, SchemaOrgType value);

	    /**
	     * Add a value to property.
	     *
	     * @param name The property name.
	     * @param builder The schema.org object builder for the property value.
	     */
	    Builder addProperty(String name, Thing.Builder builder);

	    /**
	     * Add a value to property.
	     *
	     * @param name The property name.
	     * @param value The string value of the property.
	     */
	    Builder addProperty(String name, String value);

	    /** Build a {@link FAQPage} object. */
	    FAQPage build();
	    

//	    /** Add a value to property breadcrumb. */
//	    Builder addBreadcrumb(BreadcrumbList value);
//
//	    /** Add a value to property breadcrumb. */
//	    Builder addBreadcrumb(BreadcrumbList.Builder value);
//
//	    /** Add a value to property breadcrumb. */
//	    Builder addBreadcrumb(Text value);
//
//	    /** Add a value to property breadcrumb. */
//	    Builder addBreadcrumb(String value);
//
//	    /** Add a value to property lastReviewed. */
//	    Builder addLastReviewed(Date value);
//
//	    /** Add a value to property lastReviewed. */
//	    Builder addLastReviewed(String value);
//
//	    /** Add a value to property mainContentOfPage. */
//	    Builder addMainContentOfPage(WebPageElement value);
//
//	    /** Add a value to property mainContentOfPage. */
//	    Builder addMainContentOfPage(WebPageElement.Builder value);
//
//	    /** Add a value to property mainContentOfPage. */
//	    Builder addMainContentOfPage(String value);
//
//	    /** Add a value to property primaryImageOfPage. */
//	    Builder addPrimaryImageOfPage(ImageObject value);
//
//	    /** Add a value to property primaryImageOfPage. */
//	    Builder addPrimaryImageOfPage(ImageObject.Builder value);
//
//	    /** Add a value to property primaryImageOfPage. */
//	    Builder addPrimaryImageOfPage(String value);
//
//	    /** Add a value to property reviewedBy. */
//	    Builder addReviewedBy(Organization value);
//
//	    /** Add a value to property reviewedBy. */
//	    Builder addReviewedBy(Organization.Builder value);
//
//	    /** Add a value to property reviewedBy. */
//	    Builder addReviewedBy(Person value);
//
//	    /** Add a value to property reviewedBy. */
//	    Builder addReviewedBy(Person.Builder value);
//
//	    /** Add a value to property reviewedBy. */
//	    Builder addReviewedBy(String value);
//
//	    /** Add a value to property significantLink. */
//	    Builder addSignificantLink(URL value);
//
//	    /** Add a value to property significantLink. */
//	    Builder addSignificantLink(String value);
//
//	    /** Add a value to property significantLinks. */
//	    Builder addSignificantLinks(URL value);
//
//	    /** Add a value to property significantLinks. */
//	    Builder addSignificantLinks(String value);
//
//	    /** Add a value to property specialty. */
//	    Builder addSpecialty(Specialty value);
//
//	    /** Add a value to property specialty. */
//	    Builder addSpecialty(String value);
//
//	    /** Add a value to property about. */
//	    Builder addAbout(Thing value);
//
//	    /** Add a value to property about. */
//	    Builder addAbout(Thing.Builder value);
//
//	    /** Add a value to property about. */
//	    Builder addAbout(String value);
//	    
//	    Builder addAccessMode(Text value);
//	    
//	    Builder addAccessMode(String value);
//	    
//	    Builder addAccessModeSufficient(Text value);
//	    
//	    Builder addAccessModeSufficient(String value);
//
//	    /** Add a value to property accessibilityAPI. */
//	    Builder addAccessibilityAPI(Text value);
//
//	    /** Add a value to property accessibilityAPI. */
//	    Builder addAccessibilityAPI(String value);
//	    
//	    /** Add a value to property accessibilityControl. */
//	    Builder addAccessibilityControl(Text value);
//
//	    /** Add a value to property accessibilityControl. */
//	    Builder addAccessibilityControl(String value);
//
//	    /** Add a value to property accessibilityFeature. */
//	    Builder addAccessibilityFeature(Text value);
//
//	    /** Add a value to property accessibilityFeature. */
//	    Builder addAccessibilityFeature(String value);
//
//	    /** Add a value to property accessibilityHazard. */
//	    Builder addAccessibilityHazard(Text value);
//
//	    /** Add a value to property accessibilityHazard. */
//	    Builder addAccessibilityHazard(String value);
//
//	    Builder addAccessibilitySummary(Text value);
//	    
//	    Builder addAccessibilitySummary(String value);
//
//	    /** Add a value to property accountablePerson. */
//	    Builder addAccountablePerson(Person value);
//
//	    /** Add a value to property accountablePerson. */
//	    Builder addAccountablePerson(Person.Builder value);
//
//	    /** Add a value to property accountablePerson. */
//	    Builder addAccountablePerson(String value);
//
//	    // aggregateRating
//	    Builder addAggregateRating(AggregateRating value);
//	    
//	    Builder addAggregateRating(AggregateRating.Builder value);
//	    
//	    Builder addAggregateRating(String value);
//	    
//	    /** Add a value to property alternativeHeadline. */
//	    Builder addAlternativeHeadline(Text value);
//
//	    /** Add a value to property alternativeHeadline. */
//	    Builder addAlternativeHeadline(String value);
//
//	    /** Add a value to property associatedMedia. */
//	    Builder addAssociatedMedia(MediaObject value);
//
//	    /** Add a value to property associatedMedia. */
//	    Builder addAssociatedMedia(MediaObject.Builder value);
//
//	    /** Add a value to property associatedMedia. */
//	    Builder addAssociatedMedia(String value);
//
//	    /** Add a value to property audience. */
//	    Builder addAudience(Audience value);
//
//	    /** Add a value to property audience. */
//	    Builder addAudience(Audience.Builder value);
//
//	    /** Add a value to property audio. */
//	    Builder addAudio(AudioObject value);
//
//	    /** Add a value to property audio. */
//	    Builder addAudio(AudioObject.Builder value);
//
//	    /** Add a value to property audio. */
//	    Builder addAudio(String value);
//
//	    /** Add a value to property author. */
//	    Builder addAuthor(Organization value);
//
//	    /** Add a value to property author. */
//	    Builder addAuthor(Organization.Builder value);
//
//	    /** Add a value to property author. */
//	    Builder addAuthor(Person value);
//
//	    /** Add a value to property author. */
//	    Builder addAuthor(Person.Builder value);
//
//	    /** Add a value to property author. */
//	    Builder addAuthor(String value);
//
//	    /** Add a value to property award. */
//	    Builder addAward(Text value);
//
//	    /** Add a value to property award. */
//	    Builder addAward(String value);
//
//	    /** Add a value to property awards. */
//	    Builder addAwards(Text value);
//
//	    /** Add a value to property awards. */
//	    Builder addAwards(String value);
//
//	    /** Add a value to property character. */
//	    Builder addCharacter(Person value);
//
//	    /** Add a value to property character. */
//	    Builder addCharacter(Person.Builder value);
//
//	    /** Add a value to property character. */
//	    Builder addCharacter(String value);
//
//	    /** Add a value to property citation. */
//	    Builder addCitation(CreativeWork value);
//
//	    /** Add a value to property citation. */
//	    Builder addCitation(CreativeWork.Builder value);
//
//	    /** Add a value to property citation. */
//	    Builder addCitation(Text value);
//
//	    /** Add a value to property citation. */
//	    Builder addCitation(String value);
//
//	    /** Add a value to property comment. */
//	    Builder addComment(Comment value);
//
//	    /** Add a value to property comment. */
//	    Builder addComment(Comment.Builder value);
//
//	    /** Add a value to property comment. */
//	    Builder addComment(String value);
//
//	    /** Add a value to property commentCount. */
//	    Builder addCommentCount(Integer value);
//
//	    /** Add a value to property commentCount. */
//	    Builder addCommentCount(String value);
//
//	    /** Add a value to property contentLocation. */
//	    Builder addContentLocation(Place value);
//
//	    /** Add a value to property contentLocation. */
//	    Builder addContentLocation(Place.Builder value);
//
//	    /** Add a value to property contentLocation. */
//	    Builder addContentLocation(String value);
//
//	    /** Add a value to property contentRating. */
//	    Builder addContentRating(Text value);
//
//	    /** Add a value to property contentRating. */
//	    Builder addContentRating(String value);
//
//	    /** Add a value to property endTime. */
//	    Builder addContentReferenceTime(DateTime value);
//
//	    /** Add a value to property endTime. */
//	    Builder addContentReferenceTime(String value);
//
//	    /** Add a value to property contributor. */
//	    Builder addContributor(Organization value);
//
//	    /** Add a value to property contributor. */
//	    Builder addContributor(Organization.Builder value);
//
//	    /** Add a value to property contributor. */
//	    Builder addContributor(Person value);
//
//	    /** Add a value to property contributor. */
//	    Builder addContributor(Person.Builder value);
//
//	    /** Add a value to property contributor. */
//	    Builder addContributor(String value);
//
//	    /** Add a value to property copyrightHolder. */
//	    Builder addCopyrightHolder(Organization value);
//
//	    /** Add a value to property copyrightHolder. */
//	    Builder addCopyrightHolder(Organization.Builder value);
//
//	    /** Add a value to property copyrightHolder. */
//	    Builder addCopyrightHolder(Person value);
//
//	    /** Add a value to property copyrightHolder. */
//	    Builder addCopyrightHolder(Person.Builder value);
//
//	    /** Add a value to property copyrightHolder. */
//	    Builder addCopyrightHolder(String value);
//
//	    /** Add a value to property copyrightYear. */
//	    Builder addCopyrightYear(Number value);
//
//	    /** Add a value to property copyrightYear. */
//	    Builder addCopyrightYear(String value);

	    
	    
	    
	}
}
